cmake_minimum_required(VERSION 3.4.1)

add_library( native-lib SHARED src/main/cpp/native-lib.cpp )

find_library( log-lib log )

target_link_libraries( native-lib ${log-lib} )

set(CMAKE_VERBOSE_MAKEFILE on)

set(lib_src_DIR ${CMAKE_CURRENT_SOURCE_DIR})

set(lib_build_DIR $ENV{HOME}/tmp)

file(MAKE_DIRECTORY ${lib_build_DIR})

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11")

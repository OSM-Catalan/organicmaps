project(kml)

set(SRC
  header_binary.hpp
  minzoom_quadtree.hpp
  serdes.cpp
  serdes.hpp
  serdes_binary.cpp
  serdes_binary.hpp
  type_utils.cpp
  type_utils.hpp
  types.cpp
  types.hpp
  types_v3.hpp
  types_v6.hpp
  types_v7.hpp
  types_v8.hpp
  types_v9.hpp
  visitors.hpp
)

omim_add_library(${PROJECT_NAME} ${SRC})

target_link_libraries(${PROJECT_NAME} indexer)

omim_add_test_subdirectory(kml_tests)

if(PLATFORM_DESKTOP)
  omim_add_tool_subdirectory(kmb_to_kml)
endif()

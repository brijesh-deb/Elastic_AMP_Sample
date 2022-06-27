#!/bin/bash

api_base_url=http://localhost:8082

for i in {1..5}
  do
    printf "Iteration # %s...\n" "${i}"
    curl "${api_base_url}/normal"
    printf "\n"
    curl "${api_base_url}/slow"
    printf "\n"
    curl "${api_base_url}/veryslow"
    printf "\n\n"
done

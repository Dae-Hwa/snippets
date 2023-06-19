#!/bin/bash

docker run --platform linux/amd64 -v "$PWD":/var/task "public.ecr.aws/sam/build-python3.9:latest" /bin/sh -c "pip3.9 install -r requirements.txt -t python/lib/python3.9/site-packages/; exit"

zip -r layer.zip python

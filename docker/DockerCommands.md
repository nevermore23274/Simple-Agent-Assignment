# To Build
- Podman
```podman build -f docker/Dockerfile -t agent .```

- Docker
```docker build -f docker/Dockerfile -t agent .```

# For Test
- Podman
```podman run --name java-container -it agent```

- Docker
```docker run --name java-container -it agent```

# To Cleanup
- Podman
```podman system prune -af```

- Docker
```docker system prune -af```

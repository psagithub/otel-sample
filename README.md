# otel-sample
Sample Spring WebFlux service that uses OTel to publish traces to DD agent.

## DD Agent
To run the DD agent, use the following command:
```shell
docker pull datadog/agent:7.57.2 # (or, latest).

docker run -d --cgroupns host --pid host --name dd-agent -v /var/run/docker.sock:/var/run/docker.sock:ro \
  -v /proc/:/host/proc/:ro -v /sys/fs/cgroup/:/host/sys/fs/cgroup:ro -e DD_API_KEY=<DD API KEY> \
  -e DD_SITE=datadoghq.com -e DD_OTLP_CONFIG_RECEIVER_PROTOCOLS_GRPC_ENDPOINT=0.0.0.0:4317 -p 4317:4317 datadog/agent:7.57.2
  
docker logs dd-agent -f # To print agent logs.
```

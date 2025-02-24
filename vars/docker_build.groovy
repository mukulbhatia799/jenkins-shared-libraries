def call(String DockerHubUser, String ProjectName, String TagName) {
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${TagName} ."
}

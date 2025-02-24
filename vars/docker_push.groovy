def call(String ProjectName, String ImageTag, String DockerHubUser) {
    withCredentials([usernamePassword('credentialsId':"dockerHubCred", passwordVariable: "dockerHubPass", usernameVariable:"dockerHubUser")]) {
        sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass} "
        sh "docker image tag ${ProjectName}:${ImageTag} ${DockerHubUser}/${ProjectName}:${ImageTag}"
        sh "docker push ${DockerHubUser}/${ProjectName}:${ImageTag}"
    }
}

node{
    stage('Clone repo') {
        git 'https://github.com/zohairawan/new-jenkins-pipeline-demo1.git'
    }

    stage('Build Project') {
        bat "C:\\Program^ Files\\apache-maven-3.8.5\\bin\\mvn package -DskipTests"
    }

    stage('Build Docker Image') {
        dockerImage = docker.build("zohair89/custom-pipeline:${env.BUILD_NUMBER}")
    }

    stage('Deploy') {
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
            dockerImage.push("${env.BUILD_NUMBER}")
            dockerImage.push("latest")
        }
    }
}
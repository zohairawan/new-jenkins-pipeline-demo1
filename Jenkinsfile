node{
    //Declaring and initializing variables
    def mvnHome = tool 'MyMaven'
    def dockerImageTag = "zohair89/custom-pipeline{env.BUILD_NUMBER}"

    stage('Clone repo') {
        git 'https://github.com/zohairawan/new-jenkins-pipeline-demo1.git'
        mvnHome = tool 'MyMaven'
    }

    stage('Build Project') {
        //Generate JAR file
        bat "C:\\Program^ Files\\apache-maven-3.8.5\\bin\\mvn clean install"
    }

    stage('Build Docker Image') {
        dockerImage = docker.build("zohair89/custom-pipeline:${env.BUILD_NUMBER}")
    }

    stage('Deploy') {
        echo "Docker image: ${dockerImageTag}"
        //docker-hub-credentials - we have to create in jenkins credentials
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
            dockerImage.push("${env.BUILD_NUMBER}")
            dockerImage.push("latest")
        }
    }
}
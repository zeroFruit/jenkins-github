podTemplate(
        label: 'mypod',
        containers: [
                containerTemplate(name: 'app', image: 'openjdk:8', ttyEnabled: true)
        ],
        volumes: [
                hostPathVolume(mountPath: '/var/run/docker.sock', hostPath: '/var/run/docker.sock'),
        ]
) {
    node('mypod') {
        stage('Build Application') {
            container('app') {
                git 'https://github.com/zeroFruit/jenkins-github-k8s'

                sh './gradlew assemble'
                sh './gradlew run'
            }
        }
    }
}
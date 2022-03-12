def call(Map config = [:]) {
    if (config.targetEnvironment == "Development") {
        br = config.branch.minus("origin/")
        if (config.branch!="Development"){
            br = config.branch.minus("origin/")
        } else {
            br = "Development"
        }
        sh "echo Checking out branch ${br} for project:${config.project}"
        //git branch: br, credentialsId: 'github-testshock-cmd', url: 'https://github.com/testshock/'+config.project
    } else {
//        checkout scm: [$class: 'GitSCM', userRemoteConfigs: [[url: 'https://github.com/testshock/'+config.project, credentialsId: 'github-testshock-cmd' ]], branches: [[name: '${config.gittag}']]], poll: false
        sh "echo tag:${config.gittag}|
    }
}

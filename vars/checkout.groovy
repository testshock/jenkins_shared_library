def call(Map config = [:]) {
    sh "echo ${config.targetEnvironment}"
    sh "echo ${config.branch}"
    sh "echo ${config.project}"
    
//     if (config.targetEnvironment == "Development") {
//         br = config.branch.minus("origin/")
//         if (config.branch!="Development"){
//             br = config.branch.minus("origin/")
//         } else {
//             br = "Development"
//         }
//         sh "echo Checking out branch ${br} for project:${config.project}"
//         //git branch: br, credentialsId: 'github-testshock-cmd', url: 'https://github.com/testshock/'+config.project
//     } else {
// //        checkout scm: [$class: 'GitSCM', userRemoteConfigs: [[url: 'https://github.com/testshock/'+config.project, credentialsId: 'github-testshock-cmd' ]], branches: [[name: '${config.gittag}']]], poll: false
//         //sh "echo tag:${config.gittag}"
//         sh "echo gittag here"
//     }
}

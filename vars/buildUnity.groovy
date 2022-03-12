def call(Map config = [:]) {
    //sh "/Applications/Unity/Hub/Editor/${config.unityVersion}/Unity.app/Contents/MacOS/Unity -logfile - -quit -buildTarget ${config.target} -batchmode -projectPath ${config.projectPath} -executeMethod BuildScript.PerformAndroidBuild"
    sh "echo Unity Version:${config.unityVersion}"
    sh "echo Build Target:${config.buildTarget}"
    sh "echo Target:${config.target}"
    sh "echo Project:${config.project}"
}

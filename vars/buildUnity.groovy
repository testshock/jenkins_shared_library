def call(Map config = [:]) {
    // Get script from resources and save it in filesystem
    def scriptcontents = libraryResource "com/fmgames/scripts/build-unity.sh"
    writeFile file:"build-unity.sh", text:scriptcontents
    sh "chmod a+x ./build-unity.sh"

    // Execute the script with the following parameters    
    sh "echo Unity Version:${config.unityVersion}"
    sh "echo Build Target:${config.buildTarget}"
    sh "echo Target:${config.target}"
    sh "echo Project:${config.project}"
    sh "./build-unity.sh ${config.unityVersion} ${config.target} ${config.projectPath}"

    //sh "/Applications/Unity/Hub/Editor/${config.unityVersion}/Unity.app/Contents/MacOS/Unity -logfile - -quit -buildTarget ${config.target} -batchmode -projectPath ${config.projectPath} -executeMethod BuildScript.PerformAndroidBuild"
}

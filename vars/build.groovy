def call(Map config = [:]) {
    sh "echo ${config.name}"
}

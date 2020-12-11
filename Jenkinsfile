withEnv([
    'PORT="31009"']) {
    Microservice(
        name: 'acquiring-switch',
        domainName: 'acquiring-switch',
        namespace: 'acquiring-microservice',
        production: true,
        cpu: "200m",
        type: "java",
        port: "31009",
        memory: "512Mi",
        database: true,
        serviceTesting: true,
        contractTesting: true,
        deployPR: false,
        vpcAccess: false,
        publiclyAccessible: false,
        commonFlags: "--set service.port=${PORT}",
        qaFlags: "",
        prodFlags: ""
    )
}

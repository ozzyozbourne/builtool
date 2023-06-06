abstract class GreetingTask : DefaultTask() {
    @TaskAction
    fun greet() {
        println("hello from GreetingTask")
    }
}

abstract class CustomActions : DefaultTask(){
    @TaskAction
    fun perf(){
        println("I choose not to see")
        }
}

tasks.register<GreetingTask>("hello")

tasks.register<CustomActions>("notToSee"){

    description = "Nothing to see here"
   
    dependsOn("hello")

    doLast{
        println("In the last room")
    }
    
    doFirst{
        println("In the first room")
    }
    
    println("Stuck in the middle")
}

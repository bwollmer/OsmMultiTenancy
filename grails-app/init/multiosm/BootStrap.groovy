package multiosm

class BootStrap {

    def init = { servletContext ->
        new User(username: "user1", password: "123").save()
        new User(username: "user2", password: "123").save()
    }
    def destroy = {
    }
}

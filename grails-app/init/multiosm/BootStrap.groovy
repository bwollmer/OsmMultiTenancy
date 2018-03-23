package multiosm

class BootStrap {

    def init = { servletContext ->
        if(User.count == 0){
            new User(username: "user1", password: "123").save()
            new User(username: "user2", password: "123").save()
        }
        if(Location.count == 0){
            new Location(label: "Location1", location: "L1", active: true).save(failOnError:true)
            new Location(label: "Location2", location: "L2", active: true).save()
            new Location(label: "Location3", location: "L3", active: true).save()
            new Location(label: "Location4", location: "L4", active: true).save()
        }
    }
    def destroy = {
    }
}

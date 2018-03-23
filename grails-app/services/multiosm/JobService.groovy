package multiosm

import grails.gorm.multitenancy.CurrentTenant
import grails.gorm.services.Join
import grails.gorm.services.Service

@Service(Job)
@CurrentTenant
abstract class JobService {
    abstract List<Job> list(Map args)

    abstract Long count()

    abstract void delete(Serializable id)

    abstract Job save(Job job)

    abstract Job find(Serializable id)

    abstract Job get(Serializable id)

}
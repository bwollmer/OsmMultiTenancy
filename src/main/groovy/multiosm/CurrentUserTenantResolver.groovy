package multiosm

import grails.core.GrailsApplication
import org.grails.datastore.mapping.multitenancy.TenantResolver
import org.grails.datastore.mapping.multitenancy.exceptions.TenantNotFoundException
import org.springframework.beans.factory.annotation.Autowired

class CurrentUserTenantResolver implements TenantResolver{
    @Autowired
    GrailsApplication grailsApplication

    @Override
    Serializable resolveTenantIdentifier() throws TenantNotFoundException {
        def user = grailsApplication.mainContext.getBean("springSecurityService").principal
        println user.username
        return user.username
    }
}

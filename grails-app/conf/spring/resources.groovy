import multiosm.CurrentUserTenantResolver
import multiosm.UserPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    currentUserTenantResolver(CurrentUserTenantResolver)
}
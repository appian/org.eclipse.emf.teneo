This plugin/jar file is required because it appeared that the interface in this 
plugin/jar could not be signed. If this was done then the cglib class enhancing
would fail with a security exception.

To solve this, the TeneoInternalEObject interface has been placed in this 
separate unsigned jar.

See the bugzillas:
https://bugs.eclipse.org/bugs/show_bug.cgi?id=235395
https://bugs.eclipse.org/bugs/show_bug.cgi?id=235483
IMAGE_INSTALL_append = " sudo"

inherit extrausers

ROOT_PASSWORD = "metatest"
PASSWORD = "test"
USER = "dule"

EXTRA_USERS_PARAMS = "\    
    groupadd -r netdev; \
    usermod -P ${ROOT_PASSWORD} root; \ 
    useradd -r -m -P ${PASSWORD} -s /bin/sh -d /home/dule ${USER}; \       
    usermod -a -G sudo,netdev ${USER}; \
    "

SUMMARY = "Qt Image for Raspberry Pi 4"

LICENSE = "MIT"

IMAGE_INSTALL_append = " sudo"

inherit core-image
inherit extrausers
inherit populate_sdk_qt5

IMAGE_FEATURES_remove = "debug-tweaks"

ROOT_PASSWORD = "metatest"
PASSWORD = "test"
USER = "dule"

EXTRA_USERS_PARAMS = "\    
    groupadd -r netdev; \
    usermod -P ${ROOT_PASSWORD} root; \ 
    useradd -r -m -P ${PASSWORD} -s /bin/sh -d /home/dule ${USER}; \       
    usermod -a -G sudo,netdev ${USER}; \
    "

CORE_IMAGE_EXTRA_INSTALL += "\
	dule-packagegroup-general \
	dule-packagegroup-qt5 \
	"

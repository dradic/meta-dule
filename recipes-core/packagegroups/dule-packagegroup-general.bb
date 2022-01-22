DESCRIPTION = "Dule general package group"
SUMMARY = "General package group"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
	net-tools \
        networkmanager \                       
	networkmanager-nmcli \ 
	modemmanager \
"

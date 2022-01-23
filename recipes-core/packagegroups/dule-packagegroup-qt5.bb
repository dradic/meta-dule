DESCRIPTION = "Dule qt5 package group"
SUMMARY = "Qt5 package group"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
	qtbase \
        qtmultimedia \                        
	qtquickcontrols \
	qtquickcontrols2 \
        qtsensors \
	qtserialbus \
	qtserialport \
	qtvirtualkeyboard \
        qtwayland \
"

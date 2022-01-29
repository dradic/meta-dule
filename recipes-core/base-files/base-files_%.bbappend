SUMMARY = "Replace the /etc/profile"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://licenses/GPL-2;md5=94d55d512a9ba36caa9b7df079bae19f"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI = "file://profile"

S = "${WORKDIR}"

do_install_append() {	
	install -m 0644 ${S}/profile ${D}${sysconfdir}/profile
}

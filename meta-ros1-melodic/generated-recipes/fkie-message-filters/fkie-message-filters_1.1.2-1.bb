# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Improved ROS message filters"
AUTHOR = "Timo Röhling <timo.roehling@fkie.fraunhofer.de>"
ROS_AUTHOR = "Timo Röhling <timo.roehling@fkie.fraunhofer.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "fkie_message_filters"
ROS_BPN = "fkie_message_filters"

ROS_BUILD_DEPENDS = " \
    image-transport \
    roscpp \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    image-transport \
    roscpp \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    image-transport \
    roscpp \
    sensor-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    rosunit \
    std-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fkie-release/message_filters-release/archive/release/melodic/fkie_message_filters/1.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/fkie_message_filters"
SRC_URI = "git://github.com/fkie-release/message_filters-release;${ROS_BRANCH};protocol=https"
SRCREV = "72d4fc00d86f3dafba36e1cddeca92df0a865e28"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
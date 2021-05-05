# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A collection of conversion function for extracting numpy arrays from messages"
AUTHOR = "Eric Wieser <wieser@mit.edu>"
ROS_AUTHOR = "Eric Wieser <wieser@mit.edu>"
HOMEPAGE = "http://wiki.ros.org/ros_numpy"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "ros_numpy"
ROS_BPN = "ros_numpy"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${PYTHON_PN}-numpy \
    geometry-msgs \
    nav-msgs \
    rospy \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-numpy \
    geometry-msgs \
    nav-msgs \
    rospy \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/eric-wieser/ros_numpy-release/archive/release/melodic/ros_numpy/0.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ros_numpy"
SRC_URI = "git://github.com/eric-wieser/ros_numpy-release;${ROS_BRANCH};protocol=https"
SRCREV = "b3cf2e82eac5ffc58b624c3420c028300928462d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
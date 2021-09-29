# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Supporting utilities for ROSflight packages"
AUTHOR = "gary <gary.ellingson@byu.edu>"
HOMEPAGE = "http://rosflight.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosflight"
ROS_BPN = "rosflight_utils"

ROS_BUILD_DEPENDS = " \
    gazebo-msgs \
    geometry-msgs \
    rosbag \
    roscpp \
    rosflight \
    rosflight-firmware \
    rosflight-msgs \
    rosflight-sim \
    rosgraph-msgs \
    rospy \
    sensor-msgs \
    std-srvs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-msgs \
    geometry-msgs \
    rosbag \
    roscpp \
    rosflight \
    rosflight-firmware \
    rosflight-msgs \
    rosflight-sim \
    rosgraph-msgs \
    rospy \
    sensor-msgs \
    std-srvs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-msgs \
    geometry-msgs \
    rosbag \
    roscpp \
    rosflight \
    rosflight-firmware \
    rosflight-msgs \
    rosflight-sim \
    rosgraph-msgs \
    rospy \
    sensor-msgs \
    std-srvs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rosflight/rosflight-release/archive/release/melodic/rosflight_utils/1.3.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rosflight_utils"
SRC_URI = "git://github.com/rosflight/rosflight-release;${ROS_BRANCH};protocol=https"
SRCREV = "2ab5662d72d4252f5a9ac73fc744281d7b536a84"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
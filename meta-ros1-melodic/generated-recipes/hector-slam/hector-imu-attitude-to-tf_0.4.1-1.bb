# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "hector_imu_attitude_to_tf is a lightweight node that can be used to publish the roll/pitch attitude angles reported via a imu message to tf."
AUTHOR = "Johannes Meyer <meyer@fsr.tu-darmstadt.de>"
ROS_AUTHOR = "Stefan Kohlbrecher <kohlbrecher@sim.tu-darmstadt.de>"
HOMEPAGE = "http://ros.org/wiki/hector_imu_attitude_to_tf"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "hector_slam"
ROS_BPN = "hector_imu_attitude_to_tf"

ROS_BUILD_DEPENDS = " \
    roscpp \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_imu_attitude_to_tf/0.4.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/hector_imu_attitude_to_tf"
SRC_URI = "git://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release;${ROS_BRANCH};protocol=https"
SRCREV = "463e602f35e2923f7811df82e3f6022851e119e4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
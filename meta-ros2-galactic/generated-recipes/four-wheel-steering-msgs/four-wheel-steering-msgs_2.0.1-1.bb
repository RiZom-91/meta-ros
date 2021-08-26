# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "ROS messages for robots using FourWheelSteering."
AUTHOR = "Vincent Rousseau <vincentrou@gmail.com>"
ROS_AUTHOR = "Vincent Rousseau <vincentrou@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/four_wheel_steering_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "four_wheel_steering_msgs"
ROS_BPN = "four_wheel_steering_msgs"

ROS_BUILD_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/four_wheel_steering_msgs-release/archive/release/galactic/four_wheel_steering_msgs/2.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/four_wheel_steering_msgs"
SRC_URI = "git://github.com/ros-drivers-gbp/four_wheel_steering_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "90480d011d3b5964e15cde0dd04808ef0550bfdf"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

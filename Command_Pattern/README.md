# Command Pattern

A behavioral design pattern in software engineering that turns a request into a stand-alone object that contains all information about the request. This transformation allows for parameterizing clients with queues, requests, and operations, delaying or logging the request's execution, and supporting undoable operations.

## Problem
<b>Smart Home Automation</b>

Imagine you're building a smart home automation system where various devices (lights, thermostat, music player, etc.) can be controlled remotely using a central hub or app. Each device has different functionalities, but you want to create a unified and flexible control mechanism.

Design a system that allows you to control multiple smart home devices with ease. Your goal is to create a solution where:

You can control a variety of devices from a central hub or app, sending commands like "Turn On," "Turn Off," "Increase Temperature," "Decrease Volume," etc.
Each device has unique actions associated with these commands. For example, turning on the lights might involve changing their brightness level, while turning on the music player may involve playing a specific playlist.
New devices can be seamlessly integrated into the system without modifying existing code. You want to ensure that adding a new device doesn't require changes to the central control logic.
Devices can be controlled without the central hub or app needing to understand the internal workings of each device. It should send high-level commands without needing low-level details.
Your challenge is to apply a design pattern that provides a flexible and scalable way to control a variety of smart home devices, ensuring that new devices can be added without disrupting the existing system's functionality.

<p align="center">
    <img src="sample output.png" alt="Centered Image" />
</p>

## Unified Modeling Language (UML) Class Diagram
![Command Design Pattern UML](https://github.com/SG-Hangaan/commandPattern/assets/127215110/483a64ae-30e8-4714-be47-4efe724fc83a)


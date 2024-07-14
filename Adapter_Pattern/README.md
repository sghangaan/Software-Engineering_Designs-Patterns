# Adapter Pattern

Plugging Devices into Power Outlets <br>
You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.<br>

## Adaptee Objects:
- Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.<br>
- Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.<br>
- SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.<br>

## Target Object:
- PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.<br>

## Adapter Objects:
- LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().<br>
- RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().<br>
- SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone()<br>

## Implementation of Adapter Pattern

<p align="center">
    <img src="sample output.png" alt="Centered Image" />
</p>


## Unified Modeling Language (UML) Class Diagram
![AdaptPattern_Hangaan](https://github.com/SG-Hangaan/AdapterPattern/assets/127215110/80031fa9-8a21-4fe9-be64-967c615711cc)

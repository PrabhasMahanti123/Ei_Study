# Ei_Study
# Design Pattern and Smart Home System

This project demonstrates six different software design patterns with real-world use cases. It covers Behavioral, Creational, and Structural design patterns, each implemented with clear and practical examples. These patterns promote better software design, improve code maintainability, and adhere to SOLID principles.

Patterns Implemented:
1) Behavioral Design Patterns:
Observer Pattern: A weather monitoring system where multiple devices are notified of temperature changes.
Command Pattern: A file system where commands like opening and saving files are handled dynamically.

2) Creational Design Patterns:
Singleton Pattern: A database connection manager that ensures only one instance of a connection exists.
Factory Pattern: A document generation system that creates different types of documents (PDF, Word, Excel) based on user input.

3) Structural Design Patterns:
Adapter Pattern: A payment gateway adapter that integrates multiple payment providers (e.g., PayPal, Stripe) into a common interface.
Composite Pattern: A file system where files and directories are treated uniformly, allowing complex structures to be represented hierarchically.

# Smart Home System

This is a console-based backend application designed for simulating a Smart Home System that allows users to control different smart devices such as lights, thermostats, and door locks via a central hub. The program emphasizes code quality by following object-oriented design, SOLID principles, and the use of design patterns like the Observer, Factory Method, and Proxy patterns.

Key Features
1) Device Management: Add, list, and manage smart devices in the home (lights, thermostats, door locks).
2) Scheduling: Set schedules to control devices at specific times.
3) Automation: Automate device actions based on triggers (e.g., turn off lights when the thermostat reaches a certain temperature).
4) Modular and Scalable: Built with scalability in mind, making it easy to extend for future features like energy monitoring, voice control, and advanced automations.

Design Patterns Used
1) Observer Pattern: Updates all devices when a change occurs in the system.
2) Factory Method Pattern: Creates instances of different smart devices.
3) Proxy Pattern: Controls access to devices with additional security checks.

Console Commands

Add Device: add_device [DeviceType] [DeviceID]
Add a device to the Smart Home System. Supported types include "light", "thermostat", and "door lock".

Turn On Device: turn_on [DeviceID]
Turns on the specified device by its ID.

Turn Off Device: turn_off [DeviceID]
Turns off the specified device by its ID.

Schedule Device Action: set_schedule [DeviceID] [Time] [Action]
Schedule an action (e.g., Turn On) for a device at a specific time.

Add Automation Trigger: add_trigger [Condition] [Action]
Set a trigger to automate device behavior based on conditions (e.g., "temperature > 75").


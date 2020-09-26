# scoreboard

A primitive JavaFx app, that can be used to display a scoreboard in an OBS livestream.
App will create four txt-files with names and scores of home and visiting team.
Score can be set in GUI and updated by the press of a button.

## Use in OBS

Use some sort of a scoreboard overlay (PNG image or similar). Add four text labels on top:

- name of home team
- name of visiting team
- score of home team
- score of visiting team

Set the labels to "read from file" and enter the appropriate file path, and position the label on the overlay.
Whenever the update button is pressed, the textfiles are updated and so are the labels in OBS.

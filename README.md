# This application is a backend part of fullstack application "ADVERTISMENT CREATOR".

### Application helps user to create custom ad which matches special advertisment requirements.

## At the backend you may see working Zulu API-GATEWAY app runed by Eureka and two microservices: USERS-API, AD-CREATOR.

Both microservices share same POSTGRESQL database.

User may autorize or register through User-api and receive personal ID.

This ID using Aa-Creator to save each created ad to the database with ID of current user.

Ad can be created with IMAGE URL and URL TO CLICK which is target of ad. Also effects and text may also be applied to created AD.

Once image was uploaded by IMAGE URL, new entry for this ad created and same entry is going to be modifyed with any changings.

To start new ad, new IMAGE URL should be submitted.



# To launch application
`git clone https://github.com/meinou/ad-creator-microservices.git`
`docker-compose up`

### May be needed to `idea build.gradle` each service
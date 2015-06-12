#Person service
This is a sample person service built for the purposes of testing. I will be provided as a 'blackbox' to allow trainees to get a feel for how to test 3rd party APIs.

##Start
```console
#clone the repository
#cd into the directory
./go
```

##Use
To add a person to the list run the following command
```console
curl -X POST -H "Content-Type: application/json" -d '{
        "name":"Ben"
}' http://localhost:8910/person
```

In order to get a list of people who have been added to the list run
```
curl -X GET -H "Content-Type: application/json" http://localhost:8910/person
```

# ReadMe 

This component is an event-listener and processor. It listens for the Events and processes them in whatever way makes the most sense. In this case it just builds and maintains a materialized view which tracks the state of the aggregate.

## Development

This project is driven using [Maven][mvn].

[mvn]: https://maven.apache.org/

### Run/Install locally
 
Make sure that you have this libraries installed in your local maven repository:

 - [my-company-common](https://github.com/ivans-innovation-lab/my-company-common)

```bash
$ ./mvnw clean install
```

### Run tests

This component comes with some rudimentary tests as a good starting
point for writing your own.  Use the following command to execute the
tests using Maven:

```bash
$ ./mvnw test
```

---
Created by [Ivan Dugalic][idugalic]@[lab][lab].
Need Help?  [Join our Slack team][slack].

[idugalic]: http://idugalic.pro
[lab]: http://lab.idugalic.pro
[slack]: https://join.slack.com/t/idugalic/signup
databaseChangeLog(){
    include(file: '0.changelog.groovy', relativeToChangelogFile: true)
    include(file: '1.changelog.sql', relativeToChangelogFile: true)
}
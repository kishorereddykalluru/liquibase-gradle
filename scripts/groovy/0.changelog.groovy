databaseChangeLog(){
    changeSet(id: 1, author: 'kalluki') {
        createTable(tableName: 'person') {
            column(name: 'id', type: 'VARCHAR(255)') {
                constraints(nullable: false)
            }

            column(name: 'firstname', type: 'VARCHAR(30)')
            column(name: 'lastname', type: 'VARCHAR(30)')
            column(name: 'created_at', type: 'timestamp')
            column(name: 'updated_at', type: 'timestamp')
        }
    }

    changeSet(id: 2, author: "kalluki") {
        addPrimaryKey(columnNames: 'id', constraintName: 'PRIMARY', tableName: 'person')
    }
}
syntax = "proto3";
package baeldung;
option java_package = "com.baeldung.protobuf";
option java_outer_classname = "BaeldungTraining";
 
message Course {
    int32 id = 1;
    string course_name = 2;
    repeated Student student = 3;
}
message Student {
    int32 id = 1;
    string first_name = 2;
    string last_name = 3;
    string email = 4;
    repeated PhoneNumber phone = 5;
    message PhoneNumber {
        string number = 1;
        PhoneType type = 2;
    }
    enum PhoneType {
        MOBILE = 0;
        LANDLINE = 1;
    }
}
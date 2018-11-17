package com.bojanlukic;

import java.util.ArrayList;
import java.util.List;

public interface INFLStorage {

    //creates list write
    List<String> write();

    //creates method store with inserted list savedInfo
    void store(List<String> savedInfo);
}

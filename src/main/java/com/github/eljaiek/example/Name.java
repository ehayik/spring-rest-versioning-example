package com.github.eljaiek.example;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
final class Name {
    private final String firstName;
    private final String lastName;
}

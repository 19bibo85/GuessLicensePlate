package com.guess.license.plate.Network;

public enum ServerError {
	NO_ERROR(),
	GENERAL(),
	CONNECTION (),
	PROTOCOL (),
	STREAM (),
	OBJECT_NOT_FOUND(),
	NEW_BUILD(),
	OLD_BUILD();
}
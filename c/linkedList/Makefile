CC = gcc
CFLAGS = -Wall -Wextra -std=c99

SRC_FILES = main.c
OBJ_FILES = $(SRC_FILES:.c=.o)

# Add helper.c to the SRC_FILES line if you have a helper file
# SRC_FILES = main.c helper.c

TARGET = main

all: $(TARGET)

$(TARGET): $(OBJ_FILES)
	$(CC) $(CFLAGS) -o $(TARGET) $(OBJ_FILES)

%.o: %.c
	$(CC) $(CFLAGS) -c $< -o $@

clean:
	rm -f $(TARGET) $(OBJ_FILES)

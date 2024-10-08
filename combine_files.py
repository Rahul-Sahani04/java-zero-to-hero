import os

def combine_files(root_dir, output_file):
    with open(output_file, 'w') as outfile:
        for subdir, _, files in os.walk(root_dir):
            for file in files:
                if file.endswith('.java') or file.endswith('.md'):
                    file_path = os.path.join(subdir, file)
                    with open(file_path, 'r') as infile:
                        outfile.write(f"---\nFile: {file_path}\n---\n")
                        outfile.write(infile.read())
                        outfile.write("\n\n")

if __name__ == "__main__":
    root_directory = '.'  # Change this to the root directory of your workspace
    output_filename = 'combined.txt'
    combine_files(root_directory, output_filename)
    print(f"Combined file created: {output_filename}")
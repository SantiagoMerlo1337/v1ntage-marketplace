import type { Config } from "tailwindcss";

const config = {
    darkMode: ["class"],
    content: [
        "./pages/**/*.{ts,tsx}",
        "./components/**/*.{ts,tsx}",
        "./app/**/*.{ts,tsx}",
        "./src/**/*.{ts,tsx}",
    ],
    prefix: "",
    theme: {
    	container: {
    		center: true,
    		padding: '2rem',
    		screens: {
				sm: "100%", // Para pantallas pequeñas
				md: "100%", // Para pantallas medianas
				// lg: "100%", // Para pantallas grandes
				// xl: "100%", // Para pantallas extra grandes
				// "2xl": "100%", // Para pantallas de 2XL, como especificaste
				lg: "1024px", // Para pantallas grandes
				xl: "1280px", // Para pantallas extra grandes
				"2xl": "1400px", // Para pantallas de 2XL, como especificaste
    		}
    	},
    	extend: {
    		colors: {
    			border: 'hsl(var(--border))',
    			input: 'hsl(var(--input))',
    			ring: 'hsl(var(--ring))',
    			background: 'hsl(var(--background))',
    			foreground: 'hsl(var(--foreground))',
    			primary: {
    				'50': '#FAF5FF',
    				'100': '#E9D8FD',
    				'200': '#D6BCFA',
    				'300': '#B794F4',
    				'500': '#805AD5',
    				'600': '#6B46C1',
    				foreground: 'hsl(var(--primary-foreground))',
    				DEFAULT: 'hsl(var(--primary))'
    			},
    			secondary: {
    				'100': '#C4F1F9',
    				'800': '#086F83',
    				foreground: 'hsl(var(--secondary-foreground))',
    				DEFAULT: 'hsl(var(--secondary))'
    			},
    			destructive: {
    				DEFAULT: 'hsl(var(--destructive))',
    				foreground: 'hsl(var(--destructive-foreground))'
    			},
    			warning: {
    				DEFAULT: 'hsl(var(--warning))',
    				foreground: 'hsl(var(--warning-foreground))'
    			},
    			info: {
    				DEFAULT: 'hsl(var(--info))',
    				foreground: 'hsl(var(--info-foreground))'
    			},
    			success: {
    				DEFAULT: 'hsl(var(--success))',
    				foreground: 'hsl(var(--success-foreground))'
    			},
    			muted: {
    				DEFAULT: 'hsl(var(--muted))',
    				foreground: 'hsl(var(--muted-foreground))'
    			},
    			accent: {
    				DEFAULT: 'hsl(var(--accent))',
    				foreground: 'hsl(var(--accent-foreground))'
    			},
    			popover: {
    				DEFAULT: 'hsl(var(--popover))',
    				foreground: 'hsl(var(--popover-foreground))'
    			},
    			card: {
    				DEFAULT: 'hsl(var(--card))',
    				foreground: 'hsl(var(--card-foreground))'
    			},
    			chart: {
    				'1': 'hsl(var(--chart-1))',
    				'2': 'hsl(var(--chart-2))',
    				'3': 'hsl(var(--chart-3))',
    				'4': 'hsl(var(--chart-4))',
    				'5': 'hsl(var(--chart-5))'
    			}
    		},
    		borderRadius: {
    			lg: 'var(--radius)',
    			md: 'calc(var(--radius) - 2px)',
    			sm: 'calc(var(--radius) - 4px)'
    		},
    		keyframes: {
    			'accordion-down': {
    				from: {
    					height: '0'
    				},
    				to: {
    					height: 'var(--radix-accordion-content-height)'
    				}
    			},
    			'accordion-up': {
    				from: {
    					height: 'var(--radix-accordion-content-height)'
    				},
    				to: {
    					height: '0'
    				}
    			},
    			buttonheartbeat: {
    				'0%': {
    					'box-shadow': '0 0 0 0 theme("colors.neutral.500")',
    					transform: 'scale(1)'
    				},
    				'50%': {
    					'box-shadow': '0 0 0 7px theme("colors.neutral.500/0")',
    					transform: 'scale(1.05)'
    				},
    				'100%': {
    					'box-shadow': '0 0 0 0 theme("colors.neutral.500/0")',
    					transform: 'scale(1)'
    				}
    			},
    			spin: {
    				from: {
    					transform: 'rotate(0deg)'
    				},
    				to: {
    					transform: 'rotate(360deg)'
    				}
    			},
    			pulse: {
    				'0%, 100%': {
    					opacity: '0.9'
    				},
    				'50%': {
    					opacity: '0.75'
    				}
    			},
    			ping: {
    				'75%, 100%': {
    					transform: 'scale(2)',
    					opacity: '0'
    				}
    			},
    			bounce: {
    				'0%, 100%': {
    					transform: 'translateY(-25%)',
    					animationTimingFunction: 'cubic-bezier(0.8, 0, 1, 1)'
    				},
    				'50%': {
    					transform: 'translateY(0)',
    					animationTimingFunction: 'cubic-bezier(0, 0, 0.2, 1)'
    				}
    			}
    		},
    		animation: {
    			'accordion-down': 'accordion-down 0.2s ease-out',
    			'accordion-up': 'accordion-up 0.2s ease-out',
    			buttonheartbeat: 'buttonheartbeat 2s infinite ease-in-out',
    			spin: 'spin 1s linear infinite',
    			pulse: 'pulse 4s infinite',
    			ping: 'ping 1s infinite',
    			bounce: 'bounce 1s infinite'
    		}
    	}
    },
    // eslint-disable-next-line @typescript-eslint/no-require-imports
    plugins: [require("tailwindcss-animate")],
} satisfies Config;

export default config;

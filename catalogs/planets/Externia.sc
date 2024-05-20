Planet	"Externia/Externia a"
{
	ParentBody     "Externia-Clulesc bar"
	Class          "Jupiter"
	Mass            2.06e+03
	Radius          7.51e+04
	InertiaMoment   0.232
	Oblateness      0.0149
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	EndogenousHeating 0
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "externia.cfg"
		SurfStyle       0.195
		Randomize      (0.076, 1.084, 0.290)
		detailScale     256
		tropicLatitude  0.619
		icecapLatitude  1
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     8.02
		stripeFluct     1.19
		stripeTwist     14.3
		cycloneMagn     12
		cycloneFreq     0.609
		cycloneDensity  0.507
		cycloneOctaves  0
		cycloneMagn2     0.347
		cycloneFreq2     0.831
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      5.19
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0.977
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.102
		Velocity        296
		BumpHeight      4.74
		Gamma           10
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  5
		Opacity         0.168
		mainFreq        2.54
		mainOctaves     12
		Coverage        0.103
		stripeZones     8.02
		stripeFluct     1.19
		stripeTwist     14.3
	}

	Clouds
	{
		Height          0.102
		Velocity        -441
		BumpHeight      42.4
		Gamma           0.6
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1.5
		Opacity         0
		mainFreq        2.54
		mainOctaves     12
		Coverage        0.103
		stripeZones     8.02
		stripeFluct     1.19
		stripeTwist     14.3
	}

	NoLava          true

	Atmosphere
	{
		Model          "Externia"
		Height          854
		Density         1e+04
		Pressure        1e+06
		Bright          3
		Opacity         0.5
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	93.5
			He        	6.15
			CH4       	0.265
			N2        	0.0324
			NH3       	0.0224
			O2        	0.00657
			C2H2      	0.00285
			C2H4      	0.00133
			Ne        	0.000949
			Ar        	0.000865
			C2H6      	0.000614
			C8H18     	0.000328
			C3H8      	0.000274
			H2O       	2.89e-06
			H2S       	1.54e-06
			CO2       	1.53e-06
			Kr        	3.7e-07
			Xe        	4.2e-08
			SO2       	9.67e-09
			Cl2       	2.91e-10
			CO        	2.9e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  10
	}

	Aurora
	{
		Height         18.8
		NorthLat       83
		NorthLon       -30.8
		NorthRadius    2.22e+04
		NorthWidth     8.82e+03
		NorthRings     4
		NorthBright    1
		NorthFlashFreq 70.2
		NorthMoveSpeed 1.16
		NorthParticles 10000
		SouthLat       -83.3
		SouthLon       148
		SouthRadius    2.5e+04
		SouthWidth     1.16e+04
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 60.4
		SouthMoveSpeed 0.948
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0121116736
		SemiMajorAxis   0.000236708801
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}


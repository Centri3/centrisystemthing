Moon	"Tro/Lercurnis III VII"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            0.006
	Radius          1.42e+03
	InertiaMoment   0.385
	Obliquity       1
	EqAscendNode    35.7
	TidalLocked     true

	EndogenousHeating 0
	AbsMagn         -0.275
	SlopeParam      5.77
	Albedo          0.28
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_flank_tro.cfg"
		SurfStyle       0.684
		Randomize      (-0.775, -0.598, 0.250)
		colorDistMagn   0.054
		colorDistFreq   190
		detailScale     128
		drivenDarkening 0
		seaLevel        0.237
		snowLevel       2
		tropicLatitude  0.291
		icecapLatitude  1
		icecapHeight    0.173
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.394
		heightTempGrad  0.625
		beachWidth      0.00125
		tropicWidth     0.07
		mainFreq        1.67
		venusFreq       0.336
		venusMagn       0.763
		mareFreq        1
		mareDensity     0.0916
		terraceProb     0.333
		erosion         0
		montesMagn      0.2
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0488
		dunesFreq       14.2
		dunesFraction   0.0234
		hillsMagn       1.5
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      4.11
		riversSin       5.05
		riftsMagn       10.7
		riftsFreq       7
		riftsSin        7
		canyonsMagn     0
		canyonsFreq     0.467
		canyonsFraction 0
		cracksMagn      0.1
		cracksFreq      0.8
		cracksOctaves   15
		craterMagn      0.6
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.206
		volcanoFreq     1.68
		volcanoDensity  0.282
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0.242
		volcanoRadius   0.527
		volcanoTemp     244
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.77
		stripeTwist     0.39
		cycloneMagn     2.05
		cycloneFreq     0.626
		cycloneDensity  0.394
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		SpotBrightCB    2.5
		SpotWidthCB     0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          22.4
		Velocity        30
		BumpHeight      2.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (0.605 0.861 1.000)
		ModulateBright  3
		Opacity         0.29
		mainFreq        0.618
		mainOctaves     0
		Coverage        0.206
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          22.4
		Velocity        40
		BumpHeight      3.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (1.000 0.840 0.461)
		ModulateBright  3
		Opacity         0.229
		mainFreq        0.618
		mainOctaves     0
		Coverage        0.206
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          22.4
		Velocity        50
		BumpHeight      4.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (1.000 0.000 0.352)
		ModulateBright  3
		Opacity         0.244
		mainFreq        0.618
		mainOctaves     0
		Coverage        0.206
		stripeZones     1.77
		stripeTwist     0.39
	}

	NoLava          true

	Atmosphere
	{
		Model          "Thin"
		Height          15
		Density         3.93
		Pressure        1e-07
		Greenhouse      0.000144
		Bright          7
		Opacity         1
		SkyLight        3.33
		Hue             0.347
		Saturation      2

		Composition
		{
			Ar        	20
			CO        	20
			N2        	20
			He        	20
			Ne        	20
			H2        	0.001
		}
	}

	Climate
	{
		GlobalWindSpeed  0.189
	}

	Aurora
	{
		Height         1
		NorthLat       90
		NorthLon       0
		NorthRadius    1.43e+03
		NorthWidth     1.43e+03
		NorthRings     10
		NorthBright    0.4
		NorthFlashFreq 8.24
		NorthMoveSpeed 6.44
		NorthParticles 16000
		SouthLat       -90
		SouthLon       180
		SouthRadius    1.43e+03
		SouthWidth     1.43e+03
		SouthRings     10
		SouthBright    0.1
		SouthFlashFreq 1
		SouthMoveSpeed 3.19
		SouthParticles 6000
		TopColor    (1.000 0.000 0.000)
		BottomColor (1.000 0.281 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      22.7137285
		SemiMajorAxisKm 678325.889
		Eccentricity    0.004
		Inclination     1
		AscendingNode   35.7251908
		ArgOfPericenter 200.610687
		MeanAnomaly     -189.618321
	}
}


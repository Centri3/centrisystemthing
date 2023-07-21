Moon	"Fatum/Lercurnis III I"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            0.03
	Radius          2373.3
	InertiaMoment   0.35214
	Oblateness      0.0051473
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	Albedo          0.7
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_flank_fatum.cfg"
		SurfStyle       0.67368
		Randomize      (-0.396, -0.151, -0.150)
		colorDistMagn   0.088644
		colorDistFreq   297.2
		detailScale     128
		drivenDarkening 0
		seaLevel        0.007627
		snowLevel       1.3359
		tropicLatitude  0.2912
		icecapLatitude  0.45802
		icecapHeight    0
		climatePole     1
		climateTropic   0.31298
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        1
		heightTempGrad  0.625
		beachWidth      0.001005
		tropicWidth     0.07
		mainFreq        2.1756
		venusFreq       0.67176
		venusMagn       1
		mareFreq        1.4722
		mareDensity     0
		terraceProb     0.22948
		erosion         0.045802
		montesMagn      0.5
		montesFreq      65
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      1
		riversFreq      10
		riversSin       10
		riftsMagn       100
		riftsFreq       3
		riftsSin        5
		canyonsMagn     0.02212
		canyonsFreq     72.707
		canyonsFraction 0.66563
		cracksMagn      0
		cracksFreq      2
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.37405
		volcanoFreq     1.2214
		volcanoDensity  0.37405
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45802
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.7653
		stripeTwist     0.39039
		cycloneMagn     1.957
		cycloneFreq     0.87101
		cycloneDensity  0.39663
		cycloneOctaves  0
		BumpHeight      20
		BumpOffset      0.15254
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.2725
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           0.15254
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			O2        	100
			N2        	0.0028974
		}
	}

	Clouds
	{
		Height          22.446
		Velocity        30
		BumpHeight      2.3969
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (0.605 0.861 1.000)
		ModulateBright  1
		Opacity         0.29008
		mainFreq        1.3969
		mainOctaves     0
		Coverage        0.44275
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	Clouds
	{
		Height          22.446
		Velocity        40
		BumpHeight      3.3969
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (0.461 0.545 1.000)
		ModulateBright  1
		Opacity         0.22901
		mainFreq        1.3969
		mainOctaves     0
		Coverage        0.44275
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	Clouds
	{
		Height          22.446
		Velocity        50
		BumpHeight      4.3969
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (0.480 0.927 1.000)
		ModulateBright  1
		Opacity         0.24427
		mainFreq        1.3969
		mainOctaves     0
		Coverage        0.44275
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Flank Fatum"
		Height          80
		Density         3.9262
		Pressure        0.37092
		Greenhouse      5
		Bright          7
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			O2        	99.911
			N2        	0.089372
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.09582466
		SemiMajorAxisKm 90000
		Eccentricity    0.0002
		Inclination     0
		AscendingNode   -156.641221
		ArgOfPericenter 167.633588
		MeanAnomaly     0
	}
}

